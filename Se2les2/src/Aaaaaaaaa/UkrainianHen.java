package Aaaaaaaaa;

public  class UkrainianHen extends Hen {
       @Override
       public String getDescription() {
           return super.getDescription()+"Моя страна-"+Country.UKRAINE+"Я несу "+getCountOfEggsPerMonth()+
                   " яиц в месяц." ;
       }

       @Override
       public int getCountOfEggsPerMonth() {
           return 20;
       }
   }