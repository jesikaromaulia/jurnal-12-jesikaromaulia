import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner jes = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Task");
            System.out.println("2. Lihat Task Terdekat");
            System.out.println("3. Hapus task yang sudah di selesaikan");
            System.out.println("4. Hapus Semua Task");
            System.out.println("5. Keluar");
            System.out.println("Pilih opsi: ");

            int pilihan = jes.nextInt();
            jes.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan task (format: deadline, nama task): ");
                    String input = jes.nextLine();
                    String[] parts = input.split(",");
                    int deadline = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    toDoList.addTask(deadline, name);
                    System.out.println("Task berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println(toDoList.viewNextTask());
                    break;
                case 3:
                    toDoList.removeTask();
                    break;
                case 4:
                    toDoList.clearTasks();
                    break;
                case 5:
                    run = false;
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Opsi tidak valid, silakan coba lagi.");
                    break;
            }
        } jes.close();
    }
}