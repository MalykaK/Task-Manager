package org.taskmanger.crud.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private String taskName;
    private String assignedTo;
    private int priority;
    private String resolutionTime;

}
