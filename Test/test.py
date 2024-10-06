import os
from datetime import datetime

def get_image_created_time(image_path):
    # Get the file's creation time (or modified time if preferred)
    timestamp = os.path.getctime(image_path)  # Use getmtime() for modified time
    return datetime.fromtimestamp(timestamp)

def rename_images_by_created_time(folder_path):
    # Get list of files in the folder
    files = os.listdir(folder_path)
    image_files = [file for file in files if file.lower().endswith(('.png', '.jpg', '.jpeg', '.tiff', '.bmp', '.gif'))]

    # List to store tuples of (image file, created time)
    images_with_time = []

    for image_file in image_files:
        image_path = os.path.join(folder_path, image_file)
        created_time = get_image_created_time(image_path)
        images_with_time.append((image_file, created_time))

    # Sort images by created time
    images_with_time.sort(key=lambda x: x[1])

    # Rename images in the order of creation time
    for index, (image_file, created_time) in enumerate(images_with_time, start=1):
        extension = os.path.splitext(image_file)[1]  # Get the file extension
        new_name = f"IMG_{index:03}{extension}"  # Create new name, e.g., IMG_001.jpg
        old_path = os.path.join(folder_path, image_file)
        new_path = os.path.join(folder_path, new_name)
        os.rename(old_path, new_path)
        print(f"Renamed {image_file} to {new_name}")

# Thư mục chứa ảnh
folder_path = r'C:\Users\phuon\OneDrive - ptit.edu.vn\Desktop\CodePTIT_OOP\BAI_TH_So_1\Debai'
rename_images_by_created_time(folder_path)
