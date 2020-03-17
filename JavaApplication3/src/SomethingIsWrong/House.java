/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SomethingIsWrong;

public class House{
    private float houseWidth;
    private float houseLenght;
    
    public float getHouseWidth(){
        return houseWidth;
    }
    public void setWidth(float newHouseWidth){
        this.houseWidth = newHouseWidth;
    }
    
    public float getHouseLenght(){
        return houseLenght;
    }
    public void setLenght(float newHouseLenght){
        this.houseLenght = newHouseLenght;
    }
    
    public float area(){
        float area = houseWidth * houseLenght;
        return area;
    }
}
