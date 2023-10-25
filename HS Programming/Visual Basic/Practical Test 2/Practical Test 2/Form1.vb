Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'TODO: This line of code loads data into the 'Database3DataSet.Table1' table. You can move, or remove it, as needed.
        Me.Table1TableAdapter.Fill(Me.Database3DataSet.Table1)

    End Sub

    Private Sub calc_Click(sender As Object, e As EventArgs) Handles calc.Click
        tbGE.Text = Val(tbHW.Text) * Val(tbWH.Text)
    End Sub
End Class
