package main.World;
/*
The world of the game is represented by a fixed, square grid of spaces. The grid contains three types of spaces:
• Inaccessible spaces, which the heroes cannot enter
• Market spaces, where items can be bought or sold
• Common spaces, where battles can occur

 Every time the heroes visit a space, we "roll a die," and, if they are unlucky, then the monsters are created and the battle begins immediately.
 An example world size is 8 spaces by 8 spaces. In this size our suggestion is to have 20% inaccessible spaces, 30% market spaces, and 50% common spaces.
 */
public interface IWorld {
}
