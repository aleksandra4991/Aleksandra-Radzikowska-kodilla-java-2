package com.kodilla.good.patterns.challenges;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

        public static void main(String[] args) {

        String movies = MovieStore.getMovies().entrySet()
                .stream()
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movies);

            }
        }
