Public Class Form2
    Private Sub Form2_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        txtNAME2.Text = FNE
        txtID2.Text = IDC
        txttot.Text = Tot
        txtavg.Text = Avg
        txtMV.Text = MxV

    End Sub

    Private Sub EXITbtn_Click(sender As Object, e As EventArgs) Handles EXITbtn.Click
        Me.Close()
    End Sub
End Class