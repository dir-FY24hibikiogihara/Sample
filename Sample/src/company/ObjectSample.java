package company;

import javax.net.ssl.SSLEngineResult;

public class ObjectSample {

    public static void main(String[] args) {
        //インスタンスの作成
        var  salesdepartment = new Department("Sales", "xx", 1000);
        var developdepartment = new Department("developdepartment", "xx", 1000);
        var employee = new Employee("鈴木",salesdepartment, "課長", 100);
        
        //インスタンスメソッドの呼び出し
        employee.report();
        employee.report(2);
        
        //1行開ける
        System.out.println("");
        
        //インスタンスの作成
        var engineer = new Employee("田中", developdepartment, "一般社員", 88);
                
        //インスタンスの呼び出し
        engineer.report();
        

    }

}
