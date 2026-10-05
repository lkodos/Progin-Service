package ru.lkodos.proginservice.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.lkodos.proginservice.model.Day;
import ru.lkodos.proginservice.model.Group;
import ru.lkodos.proginservice.model.Location;
import ru.lkodos.proginservice.service.GroupService;
import ru.lkodos.proginservice.util.GroupValidator;

@Controller
@RequestMapping("/groups")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;
    private final GroupValidator groupValidator;

    @GetMapping
    public String showGroups(Model model) {
        model.addAttribute("groups", groupService.findAll());
        return "groups/groups";
    }

    @GetMapping("/{id}/edit")
    public String getEditPage(@PathVariable Integer id, Model model) {
        Group group = groupService.findById(id).orElseThrow(() -> new RuntimeException("Group not found"));
        model.addAttribute("group", group);
        model.addAttribute("locations", Location.values());
        model.addAttribute("days", Day.values());
        return "groups/edit";
    }

    @GetMapping("/new")
    public String getNewPage(Model model) {
        model.addAttribute("group", new Group());
        model.addAttribute("locations", Location.values());
        model.addAttribute("days", Day.values());
        return "groups/new";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("group") @Valid Group group,
                         BindingResult bindingResult,
                         @PathVariable Integer id,
                         Model model) {
        groupValidator.validate(group, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("locations", Location.values());
            model.addAttribute("days", Day.values());
            return "groups/edit";
        }
        groupService.update(id, group);
        return "redirect:/groups";
    }

    @DeleteMapping("/{id}/delete")
    public String delete(@PathVariable Integer id) {
        groupService.delete(id);
        return "redirect:/groups";
    }

    @PostMapping
    public String createGroup(@ModelAttribute("group") @Valid Group group, BindingResult bindingResult, Model model) {
        groupValidator.validate(group, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("locations", Location.values());
            model.addAttribute("days", Day.values());
            return "groups/new";
        }
        groupService.save(group);
        return "redirect:/groups";
    }
}
