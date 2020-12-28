package com.oreilly.springit.controller;

import com.oreilly.springit.domain.Link;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/links")
public class LinkController {

    @GetMapping("/")
    public List<Link> list() {
        return null;
    }

    @PostMapping("/create")
    public Link create() {
        return null;
    }

    @GetMapping("/{id}")
    public Link read(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/update")
    public Link update() {
        return null;
    }

    @DeleteMapping("/delete")
    public void delete() {

    }

}
