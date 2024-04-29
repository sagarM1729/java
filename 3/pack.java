import useful.useme;
import java.util.*;

class pack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        useme obj = new useme();
        System.out.println("Enter the length and height of the shape :");
        int l, h;
        l = sc.nextInt();
        h = sc.nextInt();
        int area = obj.area(l, h);
        System.out.println("Enter the Total marks :");
        int a = sc.nextInt();
        System.out.println("Enter the marks obetained :");
        int b = sc.nextInt();
        double per = obj.percentage(b, a);
        System.out.println("the Area is :" + area);
        System.out.println("the Percentage is :" + per);
        sc.close();
    }
}
