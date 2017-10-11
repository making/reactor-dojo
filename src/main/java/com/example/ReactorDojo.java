package com.example;

import reactor.core.publisher.Flux;

public class ReactorDojo {

    public Flux<String> identity(Flux<String> input) {
        return input;
    }

    public Flux<String> toUppercase(Flux<String> input) {
        return input.map(String::toUpperCase);
    }

    public Flux<Integer> oddNumbers(Flux<Integer> input) {
        return input.filter(a -> a % 2 == 1);
    }

    public Flux<String> commaSplit(Flux<String> input) {
        return input.flatMap(a -> Flux.fromArray(a.split(",")));
    }
}