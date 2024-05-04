package PART2;

public interface IAggregate<T> {
    IIterator<T> createIterator();
}
