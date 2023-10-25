Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'TODO: This line of code loads data into the 'StudentDataSet1.Table1' table. You can move, or remove it, as needed.
        Me.Table1TableAdapter1.Fill(Me.StudentDataSet1.Table1)
        'TODO: This line of code loads data into the 'StudentDataSet.Table1' table. You can move, or remove it, as needed.
        Me.Table1TableAdapter.Fill(Me.StudentDataSet.Table1)

    End Sub
End Class
