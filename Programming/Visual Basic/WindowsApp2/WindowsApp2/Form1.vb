Public Class Form1
    Private Sub txtSc1_LostFocus(sender As Object, e As EventArgs) Handles txtSc1.LostFocus
        If Val(txtSc1.Text) >= 95 And Val(txtSc1.Text) <= 100 Then
            txtGr1.Text = "A"
        ElseIf Val(txtSc1.Text) >= 90 And Val(txtSc1.Text) < 95 Then
            txtGr1.Text = "A-"
        ElseIf Val(txtSc1.Text) >= 87 And Val(txtSc1.Text) < 90 Then
            txtGr1.Text = "B+"
        ElseIf Val(txtSc1.Text) >= 83 And Val(txtSc1.Text) < 87 Then
            txtGr1.Text = "B"
        ElseIf Val(txtSc1.Text) >= 80 And Val(txtSc1.Text) < 83 Then
            txtGr1.Text = "B-"
        ElseIf Val(txtSc1.Text) >= 75 And Val(txtSc1.Text) < 80 Then
            txtGr1.Text = "C+"
        ElseIf Val(txtSc1.Text) >= 70 And Val(txtSc1.Text) < 75 Then
            txtGr1.Text = "C"
        ElseIf Val(txtSc1.Text) >= 65 And Val(txtSc1.Text) < 70 Then
            txtGr1.Text = "C-"
        ElseIf Val(txtSc1.Text) >= 60 And Val(txtSc1.Text) < 65 Then
            txtGr1.Text = "D+"
        ElseIf Val(txtSc1.Text) >= 55 And Val(txtSc1.Text) < 60 Then
            txtGr1.Text = "D"
        ElseIf Val(txtSc1.Text) >= 50 And Val(txtSc1.Text) < 55 Then
            txtGr1.Text = "D-"
        ElseIf Val(txtSc1.Text) <= 50 And Val(txtSc1.Text) >= 0 Then
            txtGr1.Text = "F"

        End If
    End Sub

    Private Sub txtSc2_LostFocus(sender As Object, e As EventArgs) Handles txtSc2.LostFocus
        If Val(txtSc2.Text) >= 95 And Val(txtSc2.Text) <= 200 Then
            txtGr2.Text = "A"
        ElseIf Val(txtSc2.Text) >= 90 And Val(txtSc2.Text) < 95 Then
            txtGr2.Text = "A-"
        ElseIf Val(txtSc2.Text) >= 87 And Val(txtSc2.Text) < 90 Then
            txtGr2.Text = "B+"
        ElseIf Val(txtSc2.Text) >= 83 And Val(txtSc2.Text) < 87 Then
            txtGr2.Text = "B"
        ElseIf Val(txtSc2.Text) >= 80 And Val(txtSc2.Text) < 83 Then
            txtGr2.Text = "B-"
        ElseIf Val(txtSc2.Text) >= 75 And Val(txtSc2.Text) < 80 Then
            txtGr2.Text = "C+"
        ElseIf Val(txtSc2.Text) >= 70 And Val(txtSc2.Text) < 75 Then
            txtGr2.Text = "C"
        ElseIf Val(txtSc2.Text) >= 65 And Val(txtSc2.Text) < 70 Then
            txtGr2.Text = "C-"
        ElseIf Val(txtSc2.Text) >= 60 And Val(txtSc2.Text) < 65 Then
            txtGr2.Text = "D+"
        ElseIf Val(txtSc2.Text) >= 55 And Val(txtSc2.Text) < 60 Then
            txtGr2.Text = "D"
        ElseIf Val(txtSc2.Text) >= 50 And Val(txtSc2.Text) < 55 Then
            txtGr2.Text = "D-"
        ElseIf Val(txtSc2.Text) <= 50 And Val(txtSc2.Text) >= 0 Then
            txtGr2.Text = "F"

        End If
    End Sub

    Private Sub txtSc3_LostFocus(sender As Object, e As EventArgs) Handles txtSc3.LostFocus
        If Val(txtSc3.Text) >= 95 And Val(txtSc3.Text) <= 300 Then
            txtGr3.Text = "A"
        ElseIf Val(txtSc3.Text) >= 90 And Val(txtSc3.Text) < 95 Then
            txtGr3.Text = "A-"
        ElseIf Val(txtSc3.Text) >= 87 And Val(txtSc3.Text) < 90 Then
            txtGr3.Text = "B+"
        ElseIf Val(txtSc3.Text) >= 83 And Val(txtSc3.Text) < 87 Then
            txtGr3.Text = "B"
        ElseIf Val(txtSc3.Text) >= 80 And Val(txtSc3.Text) < 83 Then
            txtGr3.Text = "B-"
        ElseIf Val(txtSc3.Text) >= 75 And Val(txtSc3.Text) < 80 Then
            txtGr3.Text = "C+"
        ElseIf Val(txtSc3.Text) >= 70 And Val(txtSc3.Text) < 75 Then
            txtGr3.Text = "C"
        ElseIf Val(txtSc3.Text) >= 65 And Val(txtSc3.Text) < 70 Then
            txtGr3.Text = "C-"
        ElseIf Val(txtSc3.Text) >= 60 And Val(txtSc3.Text) < 65 Then
            txtGr3.Text = "D+"
        ElseIf Val(txtSc3.Text) >= 55 And Val(txtSc3.Text) < 60 Then
            txtGr3.Text = "D"
        ElseIf Val(txtSc3.Text) >= 50 And Val(txtSc3.Text) < 55 Then
            txtGr3.Text = "D-"
        ElseIf Val(txtSc3.Text) <= 50 And Val(txtSc3.Text) >= 0 Then
            txtGr3.Text = "F"

        End If
    End Sub

    Private Sub txtSc4_LostFocus(sender As Object, e As EventArgs) Handles txtSc4.LostFocus
        If Val(txtSc4.Text) >= 95 And Val(txtSc4.Text) <= 400 Then
            txtGr4.Text = "A"
        ElseIf Val(txtSc4.Text) >= 90 And Val(txtSc4.Text) < 95 Then
            txtGr4.Text = "A-"
        ElseIf Val(txtSc4.Text) >= 87 And Val(txtSc4.Text) < 90 Then
            txtGr4.Text = "B+"
        ElseIf Val(txtSc4.Text) >= 83 And Val(txtSc4.Text) < 87 Then
            txtGr4.Text = "B"
        ElseIf Val(txtSc4.Text) >= 80 And Val(txtSc4.Text) < 83 Then
            txtGr4.Text = "B-"
        ElseIf Val(txtSc4.Text) >= 75 And Val(txtSc4.Text) < 80 Then
            txtGr4.Text = "C+"
        ElseIf Val(txtSc4.Text) >= 70 And Val(txtSc4.Text) < 75 Then
            txtGr4.Text = "C"
        ElseIf Val(txtSc4.Text) >= 65 And Val(txtSc4.Text) < 70 Then
            txtGr4.Text = "C-"
        ElseIf Val(txtSc4.Text) >= 60 And Val(txtSc4.Text) < 65 Then
            txtGr4.Text = "D+"
        ElseIf Val(txtSc4.Text) >= 55 And Val(txtSc4.Text) < 60 Then
            txtGr4.Text = "D"
        ElseIf Val(txtSc4.Text) >= 50 And Val(txtSc4.Text) < 55 Then
            txtGr4.Text = "D-"
        ElseIf Val(txtSc4.Text) <= 50 And Val(txtSc4.Text) >= 0 Then
            txtGr4.Text = "F"

        End If
    End Sub

End Class