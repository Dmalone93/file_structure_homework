package com.codeclan.example.filehomework.components;

import com.codeclan.example.filehomework.models.File;
import com.codeclan.example.filehomework.models.Folder;
import com.codeclan.example.filehomework.models.User;
import com.codeclan.example.filehomework.repositories.FileRepository;
import com.codeclan.example.filehomework.repositories.FolderRepository;
import com.codeclan.example.filehomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import org.springframework.boot.ApplicationRunner;

@Component
public class DataLoader implements ApplicationRunner{

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User("Declan");
        userRepository.save(user1);

        Folder folder = new Folder("Photos", user1);
        folderRepository.save(folder);

        File file = new File("Portugal", "RAW", 40.12, folder);
        fileRepository.save(file);

//        user1.addFolders(folder);
//        userRepository.save(user1);
//
//        folder.addFiles(file);
//        folderRepository.save(folder);


    }

}
