package net.miarma.backlib.io;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileService {
    @Value("${backlib.upload.path:/tmp/uploads}")
    private String uploadPath;

    public String store(MultipartFile file) {
        try {
            if (file.isEmpty()) throw new RuntimeException("El fichero no puede estar vacío");

            Path root = Paths.get(uploadPath);
            if (!Files.exists(root)) Files.createDirectories(root);

            String filename = file.getOriginalFilename() != null ? file.getOriginalFilename() : "file_" + System.currentTimeMillis();
            Files.copy(file.getInputStream(), root.resolve(filename), StandardCopyOption.REPLACE_EXISTING);

            return filename;
        } catch (IOException e) {
            throw new RuntimeException("Error guardando fichero: ", e);
        }
    }

    public void delete(String filename) {
        try {
            Path file = Paths.get(uploadPath).resolve(filename);
            Files.deleteIfExists(file);
        } catch (IOException e) {
            throw new RuntimeException("No se pudo borrar el fichero: " + filename, e);
        }
    }
}
