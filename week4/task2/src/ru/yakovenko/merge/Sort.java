package ru.yakovenko.merge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sort {

    int numberOfFiles;
    BufferedReader[] readers;
    StringBuilder result = new StringBuilder();
    LogEntry all;

    public Sort(String [] args){
        numberOfFiles = args.length;
        readers = createReaders(args);
        initLogEntries(readers);
    }

    private void initLogEntries(BufferedReader[] readers) {
        for (BufferedReader breader: readers) {
            result.append()
        }
    }

    private BufferedReader[] createReaders(String[] fileNames) {
        BufferedReader[] readers = new BufferedReader[numberOfFiles];

        for (int i = 0; i < numberOfFiles; i++) {
            String fileName = fileNames[i];
            try {
                readers[i] = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                throw new IllegalArgumentException("Log file \"" + fileName + "\" not found");
            }
        }

        return readers;
    }

    private class LogEntry {
        private final long time;
        private final String message;

        private LogEntry(String line) {
            if (line == null) {
                throw new IllegalArgumentException("Empty line");
            }
            String[] lineComponents = line.trim().split(" ",2);
            time = Long.parseLong(lineComponents[0]);
            message = lineComponents[1];
        }

        @Override
        public String toString() {
            return time + " " + message;
        }
    }
}
