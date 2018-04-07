package io.github.yoshikawaa.sample.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Repository {
    private String name;
    @JsonProperty("html_url")
    private String htmlUrl;
}
