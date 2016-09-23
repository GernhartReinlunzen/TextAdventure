package Model;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class Chapter {

    public enum ChapterText{

        CHAPTER_ONE("Erster Text"),
        CHAPTER_TWO("Zweitewr Text");

        private String text;
        ChapterText(String text){
            this.text = text;
        }

        public String getText() {return this.text; }
    }

    ChapterText currentChapter;
    //enums
    public Chapter(ChapterText chapter){
        currentChapter = chapter;
    }

    public String getText() { return currentChapter.getText(); }
}
