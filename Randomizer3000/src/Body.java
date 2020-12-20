public class Body {
     void chest(){
         Introduce intro = new Introduce();
         intro.hello();
         Diff diff = new Diff();

         intro.minVal();
         int a = diff.getMin();

         intro.maxVal();
         int b = diff.getMax();

         int c = diff.getDiff(a,b);

         intro.comm();
         boolean boo = intro.choise();

         if (boo == false){
             diff.array(c, a);
         }
     }

}