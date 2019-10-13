package com.focusit.mathclient.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    @GetMapping("/sum/{first}/{second}")
    public ResponseEntity<Integer> sum(
            @PathVariable(name = "first") Integer first,
            @PathVariable(name = "second") Integer second
    ){
        return ResponseEntity.ok(first+second);
    }
}
