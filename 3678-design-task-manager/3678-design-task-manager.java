
class TaskManager {
    static class Task {
        int priority, taskId, userId;

        Task(int userId, int taskId, int priority) {
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }
    }

    private PriorityQueue<Task> pq;
    private Map<Integer, Task> taskMap;

    public TaskManager(List<List<Integer>> tasks) {
        pq = new PriorityQueue<>((a, b) -> {
            if (a.priority != b.priority)
                return b.priority - a.priority;
            return b.taskId - a.taskId;
        });
        taskMap = new HashMap<>();

        for (List<Integer> t : tasks) {
            add(t.get(0), t.get(1), t.get(2));
        }
    }

    public void add(int userId, int taskId, int priority) {
        Task task = new Task(userId, taskId, priority);
        pq.add(task);
        taskMap.put(taskId, task);
    }

    public void edit(int taskId, int newPriority) {
        Task oldTask = taskMap.get(taskId);
        if (oldTask != null) {
            Task newTask = new Task(oldTask.userId, taskId, newPriority);
            pq.add(newTask);
            taskMap.put(taskId, newTask);
        }
    }

    public void rmv(int taskId) {
        taskMap.remove(taskId);
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            Task top = pq.poll();
            Task valid = taskMap.get(top.taskId);
            if (valid != null && valid.priority == top.priority && valid.userId == top.userId) {
                taskMap.remove(top.taskId); 
                return top.userId;
            }
        }
        return -1;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */