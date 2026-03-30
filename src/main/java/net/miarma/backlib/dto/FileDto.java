package net.miarma.backlib.dto;

import java.time.Instant;
import java.util.UUID;

public class FileDto {

    private FileDto() {}

    public static class Request {
        private String fileName;
        private String filePath;
        private String mimeType;
        private Byte context;
        private UUID uploadedBy;

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public Byte getContext() {
            return context;
        }

        public void setContext(Byte context) {
            this.context = context;
        }

        public UUID getUploadedBy() {
            return uploadedBy;
        }

        public void setUploadedBy(UUID uploadedBy) {
            this.uploadedBy = uploadedBy;
        }
    }

    public static class Response {
        private UUID fileId;
        private String fileName;
        private String filePath;
        private String mimeType;
        private UUID uploadedBy;
        private Instant uploadedAt;
        private Byte context;

        public UUID getFileId() {
            return fileId;
        }

        public void setFileId(UUID fileId) {
            this.fileId = fileId;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public UUID getUploadedBy() {
            return uploadedBy;
        }

        public void setUploadedBy(UUID uploadedBy) {
            this.uploadedBy = uploadedBy;
        }

        public Instant getUploadedAt() {
            return uploadedAt;
        }

        public void setUploadedAt(Instant uploadedAt) {
            this.uploadedAt = uploadedAt;
        }

        public Byte getContext() {
            return context;
        }

        public void setContext(Byte context) {
            this.context = context;
        }
    }
}
