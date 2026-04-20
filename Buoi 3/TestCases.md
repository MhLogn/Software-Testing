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

| Mã TC | Bài Toán | Mục đích / Kỹ thuật | Dữ liệu đầu vào (Input) | Kết quả mong đợi (Expected) | Kết quả thực tế (Actual) | Đánh giá |
|:---|:---|:---|:---|:---|:---|:---|
| **TC1.1** | 1. Chu vi HCN | Hợp lệ (Số nguyên) | `a = 5`, `b = 3` | `16.0` | `16.0` | ✅ Pass |
| **TC1.2** | 1. Chu vi HCN | Hợp lệ (Số thập phân) | `a = 2.5`, `b = 3.5` | `12.0` | `12.0` | ✅ Pass |
| **TC1.3** | 1. Chu vi HCN | Không hợp lệ (Biên 0) | `a = 0`, `b = 5` | Lỗi: Kích thước phải > 0 | `Loi: Chieu dai va chieu rong phai lon hon 0` | ✅ Pass |
| **TC2.1** | 2. Diện tích HCN | Hợp lệ (Số nguyên) | `a = 5`, `b = 4` | `20.0` | `20.0` | ✅ Pass |
| **TC2.2** | 2. Diện tích HCN | Hợp lệ (Số thập phân) | `a = 2.5`, `b = 3.5` | `8.75` | `8.75` | ✅ Pass |
| **TC2.3** | 2. Diện tích HCN | Không hợp lệ (Số âm) | `a = 5`, `b = -3` | Lỗi: Kích thước phải > 0 | `Loi: Chieu dai va chieu rong phai lon hon 0` | ✅ Pass |
| **TC3.1** | 3. PT bậc 2 | Hợp lệ (2 nghiệm phân biệt)| `a = 1`, `b = -3`, `c = 2` | `x1 = 2.0`, `x2 = 1.0` | `2 nghiem phan biet: x1 = 2.0, x2 = 1.0` | ✅ Pass |
| **TC3.2** | 3. PT bậc 2 | Hợp lệ (Nghiệm kép) | `a = 1`, `b = -4`, `c = 4` | `Nghiệm kép x = 2.0` | `Nghiem kep x = 2.0` | ✅ Pass |
| **TC3.3** | 3. PT bậc 2 | Hợp lệ (Vô nghiệm) | `a = 1`, `b = 1`, `c = 1` | Vô nghiệm | `Vo nghiem` | ✅ Pass |
| **TC3.4** | 3. PT bậc 2 | Không hợp lệ (Hệ số a=0) | `a = 0`, `b = 2`, `c = 3` | Lỗi: Hệ số a khác 0 | `Loi: Phuong trinh bac 2 yeu cau he so a khac 0`| ✅ Pass |
| **TC4.1** | 4. Ngày của tháng| Hợp lệ (Tháng 2 năm nhuận)| `month = 2`, `year = 2024`| `29` | `29` | ✅ Pass |
| **TC4.2** | 4. Ngày của tháng| Hợp lệ (Tháng 2 ko nhuận) | `month = 2`, `year = 2023`| `28` | `28` | ✅ Pass |
| **TC4.3** | 4. Ngày của tháng| Hợp lệ (Tháng có 31 ngày) | `month = 10`, `year = 2023`| `31` | `31` | ✅ Pass |
| **TC4.4** | 4. Ngày của tháng| Không hợp lệ (Tháng sai) | `month = 13`, `year = 2023`| Lỗi: Tháng từ 1-12 | `Loi: Thang phai tu 1-12 va nam phai lon hon 0` | ✅ Pass |
| **TC5.1** | 5. Số nguyên tố | Hợp lệ (Là SNT) | `n = 7` | `true` | `true` | ✅ Pass |
| **TC5.2** | 5. Số nguyên tố | Hợp lệ (Không là SNT) | `n = 10` | `false` | `false` | ✅ Pass |
| **TC5.3** | 5. Số nguyên tố | Hợp lệ (Biên SNT nhỏ nhất)| `n = 2` | `true` | `true` | ✅ Pass |
| **TC5.4** | 5. Số nguyên tố | Không hợp lệ (Biên n=1) | `n = 1` | Lỗi: n phải lớn hơn 1 | `Loi: So n phai lon hon 1 de kiem tra nguyen to`| ✅ Pass |
| **TC6.1** | 6. Tổng đan dấu | Hợp lệ (n chẵn) | `n = 4` | `-2` | `-2` | ✅ Pass |
| **TC6.2** | 6. Tổng đan dấu | Hợp lệ (n lẻ) | `n = 5` | `3` | `3` | ✅ Pass |
| **TC6.3** | 6. Tổng đan dấu | Không hợp lệ (n < 1) | `n = 0` | Lỗi: n là số nguyên dương| `Loi: Tham so n yeu cau la so nguyen duong` | ✅ Pass |
| **TC7.1** | 7. Tìm UCLN | Hợp lệ (Cùng chia hết) | `a = 12`, `b = 4` | `4` | `4` | ✅ Pass |
| **TC7.2** | 7. Tìm UCLN | Hợp lệ (Nguyên tố cùng nhau)| `a = 7`, `b = 3` | `1` | `1` | ✅ Pass |
| **TC7.3** | 7. Tìm UCLN | Không hợp lệ (Số âm) | `a = 7`, `b = -3` | Lỗi: a,b là nguyên dương | `Loi: Ca a va b deu phai la so nguyen duong` | ✅ Pass |
| **TC8.1** | 8. Tổng giai thừa| Hợp lệ (Tính bình thường)| `n = 3` | `9` (1! + 2! + 3!) | `9` | ✅ Pass |
| **TC8.2** | 8. Tổng giai thừa| Không hợp lệ (Số âm) | `n = -2` | Lỗi: n là số nguyên dương| `Loi: Tham so n yeu cau la so nguyen duong` | ✅ Pass |
| **TC8.3** | 8. Tổng giai thừa| Ngoại lệ (Tràn bộ nhớ) | `n = 21` | Lỗi: Vượt quá giới hạn | `Loi: n qua lon, vuot gioi han bo nho...` | ✅ Pass |