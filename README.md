# Sugar High


In the solution I came up with, I decided to convert an Array which was given as an argument to a List in order to gain ability to easily manipulate elements. I thought it was a good idea to use streams feature.

My general idea was to sort all of the elements in their natural order (from lowest to highest) and then, using the 'foreach' loop we iterate through elements and sum them up until we hit the condition of '< threshold'. After we sum up a suitable elements we add them to the special 'filteredList' which contains our wanted combination of sum of lowest elements up to a certain threshold.

Getting the selected elements indices was simple, since we already had a list of candies in their original order.

The app is supposed be started in IDE just by running Main.class.
