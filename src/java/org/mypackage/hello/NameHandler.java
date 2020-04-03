/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Camilo
 */
public class NameHandler {
    String name, born, year, period;
    int age, level, currYear,currMonth;

    public NameHandler() {
        name=null;
        born=null;
        year=null;
        period=null;
        age=0;
        level=0;
        Calendar fecha = new GregorianCalendar();
        currYear = fecha.get(Calendar.YEAR);
        currMonth = fecha.get(Calendar.MONTH);
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    public String getBorn() {return born;}
    public void setBorn(String born) {this.born = born;}

    public String getYear() {return year;}
    public void setYear(String year) {this.year = year;}

    public String getPeriod() {return period;}
    public void setPeriod(String period) {this.period = period;}

    public String getAge() {calcEdad();return age+"";}    
    public void setAge(int age) {this.age = age;}

    public String getLevel() {
        calcSemestre();
        return level+"";
    }
    public void setLevel(int level) {this.level = level;}
    
//---------------------------------------------------------
   
    public void calcEdad(){
        age=currYear-Integer.parseInt(born);
    }
    
    public int mes(){
        return 0;
    }
    
    public void calcSemestre(){
        
        if(Integer.parseInt(period)==1){
            level=currYear-Integer.parseInt(year);
            level=(level*2)+1;
        }else{
            level=currYear-Integer.parseInt(year);
            level=(level*2);
        }
    }
}
