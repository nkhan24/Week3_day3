package _4_lab;

import java.util.List;

public class WildcardExample {

void printNames_grampasAndFathersOnly(List<? super Father> grampasAndFathers){
    System.out.println(grampasAndFathers);
}

void printNames_fathersAndChildrenOnly(List<? extends Father> fathersAndChildren){
    System.out.println(fathersAndChildren);
}

void printNames_allFamily(List<? super Child> allFamily){
    System.out.println(allFamily);
}

}
