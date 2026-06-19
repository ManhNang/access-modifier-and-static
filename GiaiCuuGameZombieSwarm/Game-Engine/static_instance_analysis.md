Bảng ánh xạ phân loại biến

Thuộc tính |Loại biến
health |Instance
positionX |Instance
positionY |Instance
textureData |Static

Giải thích về bộ nhớ (RAM)

Trước khi tối ưu, textureData là biến instance, nghĩa là mỗi lần khởi tạo một Zombie mới, JVM lại cấp phát 1MB trên Heap. Với 10,000 zombie, hệ thống tiêu tốn 10GB RAM, dẫn đến lỗi OutOfMemoryError.
Khi chuyển textureData thành static, biến này được chuyển từ Heap sang Metaspace (vùng nhớ lưu trữ dữ liệu lớp). Giờ đây, dù có 10,000 hay 50,000 con zombie, chúng đều dùng chung một mảng textureData duy nhất. Việc loại bỏ sự lặp lại dữ liệu giúp mức tiêu thụ RAM giảm xuống mức tối thiểu, giải quyết triệt để tình trạng tràn bộ nhớ.
