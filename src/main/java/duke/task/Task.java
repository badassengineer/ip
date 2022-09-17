package duke.task;

public abstract class Task {
    protected String description;
    protected boolean isDone;
    protected static int totalTask;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
        this.totalTask++;
    }

    public Task(String description, boolean status) {
        this.description = description;
        this.isDone = status;
        this.totalTask++;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void setStatusIcon(String instruction) {
        if (instruction == "mark") {
            isDone = true;
        }
        if (instruction == "unmark") {
            isDone = false;
        }
    }

    public String getDescription() {
        return description;
    }

    public String getDetails() {return "";};

    public static int getTotalTask() {
        return totalTask;
    }

    @Override
    public abstract String toString();
}