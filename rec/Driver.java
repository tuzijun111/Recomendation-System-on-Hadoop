package rec;

public class Driver {
    public static void main(String[] args) throws Exception {
        long startTime1 = System.currentTimeMillis();


//
        DataDividerByUser dataDividerByUser = new DataDividerByUser();
        CoOccurrenceMatrixGenerator coOccurrenceMatrixGenerator = new CoOccurrenceMatrixGenerator();
        NormalizeCoOccurrenceMatrix normalizeCoOccurrenceMatrix = new NormalizeCoOccurrenceMatrix();
        MultiplicationMapperJoin mapperJoin = new MultiplicationMapperJoin();
        MultiplicationSum multiplicationSum = new MultiplicationSum();
        RecommenderListGenerator generator = new RecommenderListGenerator();


//        String[] path2 = {args[0], args[1]};
//        coOccurrenceMatrixGenerator.main(path2);

        String[] path1 = {args[0], args[1]};
        String[] path2 = {args[1], args[2]};
//        String[] path4 = {args[2], args[0], args[3]};
//        String[] path5 = {args[3], args[4]};
//        String[] path6 = {args[4], args[5]};
        String[] path3 = {args[2], args[3]};
        String[] path4 = {args[3], args[0], args[4]};
        String[] path5 = {args[4], args[5]};
        String[] path6 = {args[5], args[6]};

        dataDividerByUser.main(path1);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Running time：" + (endTime1 - startTime1) + "ms");
        coOccurrenceMatrixGenerator.main(path2);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Running time：" + (endTime2 - endTime1) + "ms");
        normalizeCoOccurrenceMatrix.main(path3);
        long endTime3 = System.currentTimeMillis();
        System.out.println("Running time：" + (endTime3 - endTime2) + "ms");
        mapperJoin.main(path4);
        long endTime4 = System.currentTimeMillis();
        System.out.println("Running time：" + (endTime4 - endTime3) + "ms");
        multiplicationSum.main(path5);
        long endTime5 = System.currentTimeMillis();
        System.out.println("Running time：" + (endTime5 - endTime4) + "ms");
        generator.main(path6);
        long endTime6 = System.currentTimeMillis();
        System.out.println("Running time：" + (endTime6 - endTime5) + "ms");
        System.out.println("Total Running time：" + (endTime6 - startTime1) + "ms");
    }



}

