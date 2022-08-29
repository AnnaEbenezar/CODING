Public Class Form1
    Private Sub btnCal_Click(sender As Object, e As EventArgs) Handles btnCal.Click
        T1 = Val(txtMath1.Text) + Val(txtEn1.Text) + Val(txtSc1.Text)
        T2 = Val(txtMath2.Text) + Val(txtEn2.Text) + Val(txtSc2.Text)
        T3 = Val(txtMath3.Text) + Val(txtEn3.Text) + Val(txtSc3.Text)

        A1 = T1 / 3
        A2 = T2 / 3
        A3 = T3 / 3

        Me.Hide()
        Form2.Show()
    End Sub
End Class
