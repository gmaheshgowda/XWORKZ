package com.Taj.hotelapp.menu;

public class Menu {
    public int menuId;
    public String menuName;
    public String[] ingredients;

    public void displaymenu()
    {
        System.out.println("display menu started");
        System.out.println("the menu id is  :  "+menuId);
        System.out.println("menu name is  :  "+menuName);
        System.out.println("the ingredients required are ");
        for(String ing : ingredients)
        {
            System.out.print(ing+" ,");
        }
        System.out.println();
        System.out.println("display menu ended");
    }

}
