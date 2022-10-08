/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    /*
     * TODO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */
    /**
     * A Bag.
     */
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;



    /*
     * TODO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */

    /**
     * Creates a new Bag.
     *
     * @param color     the color of this Bag.
     * @param capacity  the capacity of this Bag.
     */
    public Bag(String color, int capacity){
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new String[capacity];
    }



    /*
     * TODO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */

    /**
     * Reports the size of this Bag.
     *
     * @return the color of this Bag.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Reports the number of contents of this Bag.
     *
     * @return the number of contents of this Bag.
     */
    public int getNumberOfContents() {
        return this.numberOfContents;
    }

    /**
     * Reports the capacity of this Bag.
     *
     * @return the capacity of this Bag.
     */
    public int getCapacity(){
        return this.capacity;
    }






    /*
     * TODO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */

    /**
     * Sets the color of this Bag to the given color.
     *
     * @param givenColor    the given color
     */
    public void setColor(String givenColor){
        this.color = givenColor;
    }





    /*
     * TODO: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */

    /**
     * Adds the given item into the Bag as long as the number of items
     * in the bag is less than the capacity of the Bag.
     *
     * @param item  the item to be put into the Bag.
     * @return true iff the item was added into the bag
     */
    public boolean addItem(String item){
        if (this.numberOfContents < this.capacity){
            this.contents[this.numberOfContents] = item;
            this.numberOfContents += 1;
            return true;
        }
        return false;
    }




    /**
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * Removes the last item added to this Bag.
     *
     * If there are no items in this Bag, return null.
     *
     * @return the item removed
     */
    public String popItem(){
        if (this.numberOfContents == 0){
            return null;
        }
        String removedItem = this.contents[this.numberOfContents - 1];
        this.contents[this.numberOfContents - 1] = null;
        this.numberOfContents -= 1;

        return removedItem;
    }





    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        // TODO: Implement this method.
        this.capacity += n;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return the details of this Bag as a string
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}