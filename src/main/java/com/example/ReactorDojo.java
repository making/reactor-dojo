package com.example;

import java.util.stream.Collectors;

import reactor.core.publisher.Flux;

public class ReactorDojo {

    public Flux<String> identity(Flux<String> input) {
        return input;
    }

    public Flux<String> toUppercase(Flux<String> input) {
        return input
        		.map(s -> s.toUpperCase());
    }

    public Flux<Integer> oddNumbers(Flux<Integer> input) {
        return input
        		.filter(n -> n % 2 != 0);
    }

    public Flux<String> commaSplit(Flux<String> input) {
        return input
        		.windowWhile(s -> !s.equals(","))
        		.flatMap(s -> s.collect(Collectors.joining()))
        		.flatMap(s -> Flux.fromArray(s.split(",")));
    }
}
