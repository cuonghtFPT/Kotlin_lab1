package cuonghtph34430.poly.lab1_md18306

fun main() {
    println("Hello Kotlin bài 1 nè");

    //Khai báo biết
    val a = 1 // biến val không được gán lại giá trị
    val  b = 2
    var  c = a + b // biết var được gán lại giá trị
    val mess:String = "Tổng hai số $a + $b = $c"

    //In ra màn hình console
    println(mess);

    //Demo hàm trong kotlin
    val  soA = 1;
    val soB = 3f;//Với kiểu fload thì thêm chữ "f" vào cuối số

    val  kq = phepChia(soA,soB);
    println(kq);

    //Demon kiểu dữ liệu Array
    val  arr1 = arrayOf(1.4f,2,"HelloWord");
    println("Array nè:");
    println("""Giá trị đầu tiên của mảng ${arr1[0]}""")

}



fun phepChia (soA:Int, soB:Float):String{

    if (soB == 0f) {// so sách số float thì phải thêm chữ "f" vào cuối số đó
        return  "$soB không được bằng 0"
    }

    val thuong = soA/ soB;

    return "Thương hai số $soA / $soB = $thuong"
}