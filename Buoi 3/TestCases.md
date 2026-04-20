# BÁO CÁO KẾT QUẢ THỰC HÀNH: KIỂM THỬ HỘP ĐEN
**Họ và tên sinh viên:** Hà Mạnh Long - 23010390

## 1. Mã nguồn chương trình
* **Trạng thái:** Toàn bộ mã nguồn thực thi (`MathOperations.java`), chương trình chính (`Main.java`) và các commit xử lý issue (dữ liệu hợp lệ, ngoại lệ) đã được đẩy lên hệ thống.

---

## 2. Mô tả ngắn gọn cách áp dụng kiểm thử cho từng bài
Phương pháp kiểm thử hộp đen được áp dụng với hai kỹ thuật chính: **Phân vùng tương đương** (để gom nhóm dữ liệu có chung cách xử lý) và **Phân tích giá trị biên** (để bắt lỗi ở các ngưỡng giới hạn).

* **Bài 1 & 2 (Chu vi, Diện tích HCN):** Phân vùng dữ liệu thành kích thước hợp lệ ($>0$) và không hợp lệ ($\le 0$). Kiểm thử tại biên $0$ để ném ngoại lệ.
* **Bài 3 (Giải phương trình bậc 2):** Dựa vào $\Delta$ để phân vùng thành 3 trường hợp: $\Delta > 0$ (2 nghiệm), $\Delta = 0$ (nghiệm kép) và $\Delta < 0$ (vô nghiệm). Bắt ngoại lệ cho vùng dữ liệu sai khi hệ số $a = 0$.
* **Bài 4 (Tính số ngày của tháng):** Phân vùng theo quy luật tháng: có 31 ngày, có 30 ngày và tháng 2 (chia thêm nhánh năm nhuận/không nhuận). Giá trị biên kiểm thử ở ngưỡng tháng $<1$ và tháng $>12$.
* **Bài 5 (Kiểm tra số nguyên tố):** Phân vùng dữ liệu thành nhóm số nguyên tố, nhóm không phải số nguyên tố. Giá trị $n \le 1$ thuộc vùng dữ liệu ngoại lệ.
* **Bài 6 & 8 (Tổng đan dấu & Tổng giai thừa):** Kiểm thử phân vùng cho $n$ là số chẵn/lẻ (với tổng đan dấu) để xem xét dấu của phép tính. Kiểm thử tại biên thấp nhất $n = 1$. Mọi $n \le 0$ bị từ chối.
* **Bài 7 (Tìm UCLN):** Phân vùng dữ liệu đầu vào với các trường hợp đặc biệt: 2 số nguyên tố cùng nhau, số lớn chia hết cho số bé. Bắt ngoại lệ nếu nhập số âm hoặc bằng 0.

---

## 3. Danh sách Test Case và Kết quả chạy kiểm thử

Bảng dưới đây trình bày các ca kiểm thử (Test Cases) đã thiết kế và kết quả chạy thực tế trên chương trình.

| Mã TC | Bài Toán | Dữ liệu đầu vào | Kết quả mong đợi (Expected) | Kết quả thực tế (Actual) | Đánh giá |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **TC1.1** | Chu vi HCN | `a = 5`, `b = 3` | `16.0` | `16.0` | ✅ **Pass** |
| **TC1.2** | Chu vi HCN | `a = 0`, `b = 5` | Lỗi: Chiều dài và chiều rộng phải lớn hơn 0 | Lỗi: Chiều dài và chiều rộng phải lớn hơn 0 | ✅ **Pass** |
| **TC2.1** | Diện tích HCN | `a = 5`, `b = 4` | `20.0` | `20.0` | ✅ **Pass** |
| **TC2.2** | Diện tích HCN | `a = -2`, `b = 4` | Lỗi: Chiều dài và chiều rộng phải lớn hơn 0 | Lỗi: Chiều dài và chiều rộng phải lớn hơn 0 | ✅ **Pass** |
| **TC3.1** | PT bậc 2 | `a = 1`, `b = -3`, `c = 2` | 2 nghiệm: `x1 = 2.0`, `x2 = 1.0` | 2 nghiệm: `x1 = 2.0`, `x2 = 1.0` | ✅ **Pass** |
| **TC3.2** | PT bậc 2 | `a = 1`, `b = 1`, `c = 1` | Vô nghiệm | Vô nghiệm | ✅ **Pass** |
| **TC3.3** | PT bậc 2 | `a = 0`, `b = 2`, `c = 3` | Lỗi: Phương trình bậc 2 yêu cầu hệ số a khác 0 | Lỗi: Phương trình bậc 2 yêu cầu hệ số a khác 0 | ✅ **Pass** |
| **TC4.1** | Ngày của tháng | `month = 2`, `year = 2024` | `29` | `29` | ✅ **Pass** |
| **TC4.2** | Ngày của tháng | `month = 13`, `year = 2023`| Lỗi: Tháng phải từ 1-12 và năm phải lớn hơn 0 | Lỗi: Tháng phải từ 1-12 và năm phải lớn hơn 0 | ✅ **Pass** |
| **TC5.1** | Số nguyên tố | `n = 7` | Là số nguyên tố | Là số nguyên tố | ✅ **Pass** |
| **TC5.2** | Số nguyên tố | `n = 1` | Lỗi: Số n phải lớn hơn 1 để kiểm tra nguyên tố | Lỗi: Số n phải lớn hơn 1 để kiểm tra nguyên tố | ✅ **Pass** |
| **TC6.1** | Tổng đan dấu | `n = 5` | `3` | `3` | ✅ **Pass** |
| **TC6.2** | Tổng đan dấu | `n = 0` | Lỗi: Tham số n yêu cầu là số nguyên dương | Lỗi: Tham số n yêu cầu là số nguyên dương | ✅ **Pass** |
| **TC7.1** | UCLN | `a = 12`, `b = 4` | `4` | `4` | ✅ **Pass** |
| **TC7.2** | UCLN | `a = 7`, `b = -3` | Lỗi: Cả a và b đều phải là số nguyên dương | Lỗi: Cả a và b đều phải là số nguyên dương | ✅ **Pass** |
| **TC8.1** | Tổng giai thừa | `n = 3` | `9` | `9` | ✅ **Pass** |
| **TC8.2** | Tổng giai thừa | `n = -2` | Lỗi: Tham số n yêu cầu là số nguyên dương | Lỗi: Tham số n yêu cầu là số nguyên dương | ✅ **Pass** |