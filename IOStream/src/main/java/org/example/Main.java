package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Game g = new Game();
    static String play =   "no";
    public static void main(String[] args) {
        //Có hai cách phổ biến để lưu lại thuộc tính của các đối tượng

        //Cách 1: Lưu từng giá trị thuộc tính ra file theo cấu trúc được định nghĩa trước
        read_and_write_state_values_into_file();

       //Cách 2: "Nén" và lưu đối tượng ra file
//        read_and_write_objects();

    }


    public static void read_and_write_state_values_into_file(){
        try {
            //Tạo đối tượng FileReader để kết nối với file
            FileReader fileReader = new FileReader("game.txt");
            //Tạo đối tượng BufferedReader để hỗ trợ việc đọc dữ liệu hiệu quả hơn
            //buffer sẽ lấy dữ liệu từ file vào và chúng ta thực hiện việc đọc từng dòng dữ liệu trên buffer
            //như vậy tốc độ chạy sẽ hiệu quả hơn việc mỗi khi cần một dòng dữ liệu chúng ta lại phải truy cập file (lưu trên disk)
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //Đọc từng dòng dữ liệu
            //Lưu ý, chúng ta đã (ngầm) quy ước mỗi dòng sẽ lưu một thông tin, đầu tiên là score, sau đó là age, và cuối cùng là power (xem dòng )
            //khi đọc dữ liệu và khởi tạo lại giá trị cho các thuộc tính, chúng ta cũng cần thực hiện theo đúng thứ tự này
            //Rủi ro rất lớn khi lưu dữ liệu kiểu này là thứ tự các thuộc tính có thể bị đọc nhầm
            String line = bufferedReader.readLine();
            g.setScore(Integer.valueOf(line));
            line = bufferedReader.readLine();
            g.getCharacter().setAge(Integer.valueOf(line));
            line = bufferedReader.readLine();
            g.getCharacter().setPower(Integer.valueOf(line));
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("The first play");
        }
        //Đây là đoạn code thực hiện chương trình trò chơi, khi nào người chơi nhập vào "no" trò chơi sẽ kết thúc
        do{
            System.out.println("Your score: " + g.getScore());
            System.out.println("Your character: power = " +
                    g.getCharacter().getPower() + " age = " + g.getCharacter().getAge()
                    + " a = " + g.getCharacter().a);
            System.out.println("Do you want to play game? (yes/no)");
            play = scanner.next();
            if(!play.equals("no")){
                System.out.println("Input a number: ");
                int x = scanner.nextInt();
                g.addScore(x);
                g.getCharacter().increaseAge();
                g.getCharacter().increasePower();
            }
        }while (!play.equals("no"));

        //Trước khi kết thúc trò chơi, sẽ ghi lại giá trị các thuộc tính của đối tượng ra file

        if (play.equals("no")){
            try {
                //Tạo một đối tượng FileWriter để kết nối với file
                FileWriter filewriter = new FileWriter("game.txt");
                //Thay vì ghi trực tiếp lên file chúng ta sẽ ghi lên Buffer để tăng độ hiệu quả của việc ghi
                //Khi buffer đầy, nó sẽ tự động ghi dữ liệu lên file
                BufferedWriter writer = new BufferedWriter(filewriter);
                //Lần lượt ghi từng thuộc tính vào file theo một cấu trúc nào đó
                //Ở đây chúng ta ghi mỗi thuộc tính một dòng với thứ tự lần lượt là score, age, và power
                writer.write(new Integer(g.getScore()) + "\n");
                writer.write(new Integer(g.getCharacter().getAge()) + "\n");
                writer.write(new Integer(g.getCharacter().getPower()) + "\n");
                writer.close();
            }catch (IOException e){
                System.out.println("Write file exception");
            }
            }
    }

    public static void read_and_write_objects(){

        try {
            //Tạo một đối tượng FileInputStream để kết nối với file (Connection stream)
            FileInputStream inFileStream = new FileInputStream("game.data");
            //Tạo đối tượng ObjectInputStream để đọc dữ liệu (Chain stream)
            ObjectInputStream input = new ObjectInputStream(inFileStream);
            //Dữ liệu trả về thuộc kiểu Object
            Object o = input.readObject();
            //Do đó cần cast về kiểu phù hợp
            g = (Game) o;
            input.close();
        }catch (Exception e){
            //Nếu file chưa tồn tại hoặc việc đọc file có lỗi thì exception sẽ được ném ra
            System.out.println("Read object exception");
        }
        //Đây là đoạn code thực hiện chương trình trò chơi, khi nào người chơi nhập vào "no" trò chơi sẽ kết thúc
        do{
            System.out.println("Your score: " + g.getScore());
            System.out.println("Your character: power = " +
                    g.getCharacter().getPower() + " age = " + g.getCharacter().getAge()
                    + " a = " + g.getCharacter().a);
            System.out.println("Do you want to play game? (yes/no)");
            play = scanner.next();
            if(!play.equals("no")){
                System.out.println("Input a number: ");
                int x = scanner.nextInt();
                g.addScore(x);
                g.getCharacter().increaseAge();
                g.getCharacter().increasePower();
            }
        }while (!play.equals("no"));

        //Trước khi kết thúc trò chơi, sẽ ghi lại các đối tượng ra file
        if(play.equals("no")) {
            try {
                //Tạo một đối tượng FileOutputStream để kết nối với file (Connection stream)
                FileOutputStream outFileStream = new FileOutputStream("game.data");
                //Tạo một đối tượng ObjectOutputStream để ghi dữ liệu vào file
                ObjectOutputStream os = new ObjectOutputStream(outFileStream);
                //Thực hiện việc ghi dữ liệu ra file
                os.writeObject(g);
                os.close();
            } catch (IOException exception) {
                System.out.println("Write object exception");
            }
        }
    }
}











