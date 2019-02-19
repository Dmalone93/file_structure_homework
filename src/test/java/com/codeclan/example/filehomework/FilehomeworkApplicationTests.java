package com.codeclan.example.filehomework;

import com.codeclan.example.filehomework.models.File;
import com.codeclan.example.filehomework.models.Folder;
import com.codeclan.example.filehomework.models.User;
import com.codeclan.example.filehomework.repositories.FileRepository;
import com.codeclan.example.filehomework.repositories.FolderRepository;
import com.codeclan.example.filehomework.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilehomeworkApplicationTests {

	@Autowired
	FileRepository fileRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}


	@Test
	public void createFileAndFolder() {
		User declan = new User("Declan");
		userRepository.save(declan);

		Folder photos = new Folder("Photos", declan);
		folderRepository.save(photos);

		File image = new File("Portugal", "RAW", 40.12, photos);
		fileRepository.save(image);

		photos.addFiles(image);
		folderRepository.save(photos);

		declan.addFolders(photos);
		userRepository.save(declan);
	}

}
