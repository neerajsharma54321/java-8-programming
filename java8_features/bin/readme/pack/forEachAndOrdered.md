forEach => will not gaurntee for the sequential order when we will iterating the data

Stream.of("AAA","BBB","CCC").forEach(s->System.out.println("Output:"+s));

Stream.of("AAA","BBB","CCC").forEachOrdered(s->System.out.println("Output:"+s));

Note: Both have the same result because we are using the sequential stream.



Stream.of("AAA","BBB","CCC").parallel().forEach(s->System.out.println("Output:"+s));

Stream.of("AAA","BBB","CCC").parallel().forEachOrdered(s->System.out.println("Output:"+s));

now forEach for the paraller stream will not gaurntee to ordered result but forEachOrdered data will genereate
the ordered result.

