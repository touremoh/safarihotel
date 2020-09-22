package com.safarihotel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/confirmation")
public class ConfirmationController {

    @GetMapping
    String create() {
        return "confirmation";
    }
}