package com.example.restequation.controller;

import com.example.restequation.util.EquationUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquationController {
	@GetMapping("/quadratic")
	public ResponseEntity<String> solveQuadraticEquation(
			@RequestParam("a") int a,
			@RequestParam("b") int b,
			@RequestParam("c") int c) {
		return ResponseEntity.ok(EquationUtil.calculateSolveQuadratic(a,b,c));
	}
}
