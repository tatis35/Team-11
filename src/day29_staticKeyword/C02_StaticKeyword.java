package day29_staticKeyword;



public class C02_StaticKeyword {

    public static void main(String[] args) {

        System.out.println(C01_static.okulTelefonu);



        C01_static.okulTelefonu="3125474747";

        System.out.println(C01_static.okulTelefonu);


        C01_static obj1=new C01_static();
        C01_static obj2=new C01_static();

        System.out.println(obj2.okulIsmi);

        obj2.okulIsmi="Sabir Koleji";

        System.out.println(obj1.okulIsmi);
    }
}
