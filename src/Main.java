public class Main {
    public static void main(String[] args){
        OrderQueue queue = new OrderQueue();

        queue.enqueue("Saket", "CinnammonRoll", true);
        queue.enqueue("Taylor", "Sourdough", true);
        queue.enqueue("Sonu", "Greens", true);
        queue.enqueue("Alice", "Bread", false);
        queue.enqueue("Siddhika", "Singapore", true);
        queue.enqueue("Ajaz", "idk", false);

        queue.displayQueue();

        System.out.println("\n ---Processing Orders ---");
        while(!queue.isEmpty()){
            queue.dequeue();
        }
    }
    
}
