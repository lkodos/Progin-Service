package ru.lkodos.proginservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lkodos.proginservice.service.GroupService;

@Controller
@RequestMapping("/groups")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @GetMapping
    public String showGroupsPage(Model model) {
        model.addAttribute("groups", groupService.findAll());
        return "groups";
    }
}
