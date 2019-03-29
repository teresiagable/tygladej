package gable.tygladej.entity;

import java.util.stream.Stream;

public enum Prints {
	OneColored(0,1),
	Stripes(0,2),
	Dots(0,3),
	Stars(0,4),
	Transport(0,5),
	Animals(0,6),
	FruitsAndSweets(0,7),
	Flowers(0,8),
	Misc(0,9),
	SeaAnimals(6,60),
	Birds(6,61),
	Fairytell(6,62),
	ForestAnimals(6,63);
	
	int parentId;
	int id;
	
	private Prints(int parentId, int id) {
		this.parentId = parentId;
		this.id = id;
	}
	
    public static Stream<Prints> stream() {
        return Stream.of(Prints.values()); 
    }

}
