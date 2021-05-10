package com.hllbr.kotlinlearningv6_datacollections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Veri Koleksiyonları =Verilerin bi yerde toplanması olarak ifade edebiliriz
        Veri Koleksiyonlarına örnek olarak =
        Diziler
        Listeler
        Demetler(Python)
        Set
        HashSet
        Map
        HashMap
        ....

        Birden fazla veriyi tek bir değişken altında toplayarak erişime açmak olarak ifade edebiliriz

         */

        //Arrays ==


        println("*Array*")

        val myArray = arrayOf("hllbr","murat","onur","Hilal","Lars"," juicy","Kirk")//Liste içerisinde ne depolayacaksam parantez içersine bu veriyileri sallamam gerekiyor.


        //myArray artık benim için içinde Stringler tutan bir dizi olarak anlam buluyor

        //Eğer dizinin ilk elemanına ulaşmak istiyorsam bunun için =

        myArray[0] // yazmama yeterli olacaktır.

        println("First DATA in myArray : " + myArray[0])//Dizi içierisindfe bu tanımlamaya index ile çağırma deniliyor.

        //Dizielrin indexi her zaman 0 dan başlar !!!!!

        println(myArray.size)//Dizinin Boyutunu Sorgulamak için kullandığım bir metod == Size

        //Eğer ben Tüm diziyi yazdırmak istersem :

        println(myArray)//Bu şekilde bir ifade ile çalışırsam hata ile daha doğrusu karmaşık bir dizimle karşılaşırım.

        //üst Satırdaki işlemle elde ettiğmiz sonuç dizimizin nerde kayıtlı olduğunu bilgisidir.

        println("Fourth index with .get() : "+myArray.get(4))//İndex mantığının farklı bir çalışma şekli olarak düşünülebilir bu yapımız 4. indexi getirmek  için kullandğığımız farklı bir teknik oalrak ifade edebiliriz.

        //get metodu gibi birde set metodu bulunuyor bu metod iki parametere ister bunlardan birincisi hangi index üzerinde işlemi yapmak istediğim ikincisi ise bu parameter(index) içinde yapılacak değişiklik

        myArray.set(1,"Hllbr is connected")

        //get metodunu veriyi almak için bir kolaylık olarak düşünebiliriz. aynı şekilde set metodunuda veri üzerinde ayarlamalar yapmak için bir kolaylık oalrak ifade edebiliriz.


        println(myArray.get(1))

        myArray[1] = "HLLBR is Gamer"
        println(myArray[1])

        //ikinici ksımda yaptığım işlem daha kolay olark ifade edildiği için Arraylerde genellikle set ve get kullanmak çok tercih edilen yöntemler değildir.

        myArray.reverse()//Sırayı tam tersine çevirmek için kullanılan bir yapı

        myArray.sort()//Sırala


        //Eğer ben mevcut Listeme bir değer daha eklemek isteyebilirim ve bunu işlemlerimin ilerleyen kısımlarında ypamak isteyebilirim.

        /*

        myArray.put()
        myArray.add()
        gibi yapıalrım Arrayler için geçerli yöntemler değil

         */


        //Liste uzunluğum şuan 7 veriden oluşuyor ben 8. bir veri oluşturmak istiyorum


        //Mistaken

        myArray[8] = "Kotlin"

        println("8.index : "+myArray[8])
        //Bu yapı bana bir sonuç vermeyecek çünkü ben Arrayi veya başka bir Listeyi oluştururken Size yani liste boyutunu büyütmüş oluyorum

        //Her zaman dizinin boyutunu bilerek işlemler yapamayabiliriz. Bu yüzden Diziler yerine Listeleri kullanarak işlemlerimizi yapmak daha mantıklı oluyor.

        //Listelerimizin temelini Dizilerimiz oluşturuyor

        //Dizi Array olarak tanımlandı Liste ise ArrayList oalrak ifade ediliyor .



        val numberArray = arrayOf(1,2,3,4,5)

        println(numberArray[3])

        //Dizi içerisinde 5 değer 4 index var Eğer ben 5.indexi yazdırmak yada 5. index ile işlem yapmak isteseydim app çökerdi

        //println(numberArray[5])//Derleyici burtada bana arrayIndexOutOfBoundsException hatası verecek yani arrayin boyunu aştın şeklinde bir hata appimizi çökertecek

        //Eğer ArrayOluştururken en baştan Arrayin(Dizinin) türünü belirterek işlemlerime devam etmek istersem alt satırdaki gibi tanımlamalar yapmak istersem =


        val myNewArray = doubleArrayOf()
        val nyArray2New = floatArrayOf()


        /*
        Bir Dizimiz olsun bunun içerisinde bir int birde String bir değer olsun istediğim dururmda böyle bir Dizi meydana getirebilir miyim ?
        any = dizi içerisinde harhangi birşey olacak anlamına gelir eğer istediğim gibi bir tanımlama yaparsam any olarak sınıflandırılacaktır.
         */

        val mixedArray = arrayOf("hllbr",1)//Bu yapıyı her yazılım dili desteklemiyor fakat Kotlin bu yapıyı destekliyor.
            println(mixedArray[0])












    }
}