//package Files;
//
//import java.io.*;
//
//public class PrintFiles {
//    private File startingPath = new File("/Users/candrici/Desktop/Personal");
//
//    public static void main(String args[]) {
//        PrintFiles files = new PrintFiles();
//        try (BufferedWriter outputFile = new BufferedWriter(new FileWriter("/Users/candrici/Desktop/Personal/file.txt"))){
//
//            files.printFile(files.startingPath, outputFile, 0);
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }
//
//    }
//
////    private void printFile(File start, BufferedWriter outputFile, int countTabs) throws IOException {
////        if (start.isDirectory()) {
////            for (File f : start.listFiles()) {
////                for (int i = 0; i < countTabs ; i++) {
////                    outputFile.write("\\");
////                }
////
////                if (f.isDirectory()) {
////                    outputFile.write("dir->");
////                }
////                outputFile.write(f.getName());
////                if (f.isFile()) {
////                    outputFile.write("size: "+sizeToKb(f) + "kb");
////                }
////                if (f.isDirectory()){
////                    int count = f.list(new FilenameFilter() {
////                        @Override
////                        public boolean accept(File dir, String name) {
////                            return startingPath.isFile();
////                        }
////                    }
////
////                }
////                outputFile.newLine();
////                if (f.isDirectory())
////                    printFile(f, outputFile, countTabs+1);
////            }
////
////            startingPath.listFiles();
//
//        }
//    }
//
//        private long sizeToKb(File f){
//        return f.length()/1024;
//        }
//}
