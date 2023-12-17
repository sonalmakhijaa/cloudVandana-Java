import java.util.Scanner;
class Main {
    
    public int romanInt(String s){
        int d=0,temp=0,sum=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I': 
                        d=1;
                        break;
                case 'V':
                        d=5;
                        break;
                case 'X':
                        d=10;
                        break;
                case 'L': 
                        d=50;
                        break;
                case 'C': 
                        d=100;
                        break;
                case 'D': 
                        d=500;
                        break;
                case 'M': 
                        d=1000;
                        break;
            }
            
            if(d<temp){
                sum=sum-d;//
                temp=d;//
            }else{
                sum=sum+d;//
                temp=d;//
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman Number: ");
        String str = sc.nextLine();
        Main obj = new Main();
        int res = obj.romanInt(str);
        System.out.println("Integer Number: "+res);
        
    }
}