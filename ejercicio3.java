import java.util.*;
public class ejercicio3{
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        int num=0;
        int factorial = 1;
        System.out.println("ingresar número entero");
        num = scanner.nextInt();
    if (num <0){
        System.out.println("numero menor que 0 no se puede calcular");
    }
    else {    
    while( num !=0 ){
    factorial *= num;
    num --;
}    
}    
    System.out.println("factorial del número "+factorial);
} 
}