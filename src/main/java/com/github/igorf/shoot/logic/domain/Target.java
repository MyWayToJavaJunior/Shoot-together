package com.github.igorf.shoot.logic.domain;

import lombok.Data;
import java.util.List;

@Data
public class Target {
    private long id;
    private String title;
    private List<TargetRing> rings;
}