package Phylum;

public interface TestCondition {
	// While working with this, I couldn't help but notice this interface is not being implemented to any class.
	// As a matter of fact, I get errors when I try to implement this interface.
	// However, the filter method doesn't work without this boolean in this interface. Even trying to use booleans directly creates errors.
	// See my comment on Main - line 84
	boolean test(Animals item);
}