package chapter06.chapter06_03;

import java.io.File;
import java.util.List;

interface FileContentProcessor {
    void processContents(File path,
                         byte[] binaryContents,
                         List<String> textContents);
}
